package telran.data;

public enum WeeksDay {
    MONDAY ("mon"),
    TUESDAY ("tue"),
    WEDNESDAY ("wed"),
    THURSDAY ("thu"),
    FRIDAY ("fri"),
    SATURDAY ("sat"),
    SUNDAY ("sun");

    private String title;

    WeeksDay(String title) {
        this.title = title;
    }

    public void printHello(){
        System.out.println("Hello " + title + "!");
    }

//    @Override
//    public String toString() {
//        return "WeeksDay{" +
//                "title='" + title + '\'' +
//                '}' + super.toString();
//    }
}
