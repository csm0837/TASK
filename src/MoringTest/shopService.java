package MoringTest;

public class shopService {

  private static shopService singleton = new shopService();

  private shopService() {
  }

  static shopService getInstance() {
    return singleton;
  }
}

