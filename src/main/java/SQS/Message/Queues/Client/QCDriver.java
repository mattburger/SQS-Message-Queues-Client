package SQS.Message.Queues.Client;

import com.amazonaws.services.sqs.model.Message;

import java.util.Scanner;

public class QCDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Queue name: ");
        String queueName = scanner.nextLine();
        QueueClient qc = new QueueClient(queueName);

        while(true) {
            qc.retrieveFromQueue();

            for(Message msg: qc.getMessages()) {
                System.out.println(msg.getBody());
            }
        }
    }
}
