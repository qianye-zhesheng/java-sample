package lesson10;

public class Sample0102 {

	public static void main(String[] args) {
		String title = "ドラッグストアからのお知らせ";
        System.out.println(title);
        
        String[] notices = {
                "ポイント5倍キャンペーン開催中！",
                "新しいクーポンが追加されました",
                "メンテナンスのお知らせ"
            };
        
        System.out.println("件数：" + notices.length);
        
        System.out.println("--------------------");
        
        for (int i = 0; i < 3; i++) {
        	System.out.println(notices[i]);
        }
	}
}
