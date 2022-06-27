public class Client {
    public static void main(String[] args) {
        Internet internet = new Proxy();
        try{
            internet.connectTo("www.wiut.uz");
            internet.connectTo("www.instagram.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
