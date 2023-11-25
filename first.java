class HelloWorld{
    private void display(){
        System.out.println("Hello world..!");
    }

    public void d(){
        display();
    }
}

class main {
    public static void main(String[] args) {
        HelloWorld a = new HelloWorld();
        a.d();
    }
}
