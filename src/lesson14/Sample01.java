package lesson14;

public class Sample01 {

	public static void main(String[] args) {

		boolean useEmail = true;

		Notifier notifier;

		if (useEmail) {
			notifier = new EmailNotifier();
		} else {
			notifier = new SmsNotifier();
		}

		notifier.send("登録が完了しました");
	}

}
