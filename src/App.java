public class App {
    public static void main(String[] args) throws Exception {
        Model m = new Model();
        View v = new View();
        Controller c = new Controller(v, m);
        //c.initController();
    }
}
