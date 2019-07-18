package SQS.Message.Queues.Client;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.Message;

import java.util.List;

public class QueueClient {

    private AmazonSQS sqs;
    private String queueName;
    private String queueURL;
    private List<Message> messages;

    public QueueClient(String queueName) {
        this.sqs = AmazonSQSClientBuilder.defaultClient();
        this.queueName = queueName;
        this.queueURL = this.sqs.getQueueUrl(this.queueName).getQueueUrl();
    }

    public List<Message> retrieveFromQueue() {
        this.messages = sqs.receiveMessage(this.queueURL).getMessages();
        for (Message m : messages) {
            sqs.deleteMessage(this.queueURL, m.getReceiptHandle());
        }

        return this.messages;
    }

    public List<Message> getMessages() {
        return this.messages;
    }
}