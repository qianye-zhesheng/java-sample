package lesson10;

public class Sample0104 {

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
        
      for (String notice: notices) {
    	  System.out.println(notice);
      }
	}
}
