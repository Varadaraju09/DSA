class Browser implements Browser1 , Browser2, Browser3 {
    @Override
    public void browser1() {
        System.out.println("Safari");
    }
    @Override
    public void browser2() {
        System.out.println("Google");
    }
    @Override
    public void browser3() {
        System.out.println("Mozilla FireFox");
    }
    public static void main(String[] args) {
        Browser b = new Browser();
        b.browser1();
        b.browser2();
        b.browser3();
    }
}
