package api.example.myfirstapi;

public class Response {

    private String message;
    private String parameter2;
    private int parameter3;
    private boolean parameter4;

    // Constructor

    /* {messsage: "json1",
       message2: "json2"} */ 
    public Response() {}

    public Response(String message, String parameter2, int parameter3, boolean parameter4) {
        this.message = message;
        this.parameter2 = parameter2;
        this.parameter3 = parameter3;
        this.parameter4 = parameter4;
    }

    // Getters and Setters

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getParameter2() {
        return parameter2;
    }

    public void setParameter2(String parameter2) {
        this.parameter2 = parameter2;
    }

    public int getParameter3() {
        return parameter3;
    }

    public void setParameter3(int parameter3) {
        this.parameter3 = parameter3;
    }

    public boolean isParameter4() {
        return parameter4;
    }

    public void setParameter4(boolean parameter4) {
        this.parameter4 = parameter4;
    }

    @Override
    public String toString() {
        return "Response{" +
                "message='" + message + '\'' +
                ", parameter2='" + parameter2 + '\'' +
                ", parameter3=" + parameter3 +
                ", parameter4=" + parameter4 +
                '}';
    }
}
