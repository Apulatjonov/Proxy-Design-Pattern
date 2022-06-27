import java.util.ArrayList;
import java.util.List;

public class Proxy implements Internet {
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("www.twitter.com");
        bannedSites.add("www.instagram.com");
    }

    private Internet internet = new RealInternet();

    @Override
    public void connectTo(String server) throws Exception {
        if (bannedSites.contains(server)){
            throw new Exception("Access Denied!");
        }
        internet.connectTo(server);
    }
}
