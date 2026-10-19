package lesson14;

public class EmailNotifier implements Notifier {

	@Override
	public void send(String message) {
		System.out.println("メール送信:" + message);
	}

}
