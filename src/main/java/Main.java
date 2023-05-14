public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 456789";
        post.patronymic = "Иванович";
        post.phone = "+7 (978)-885-31-48";
        post.surname = "Иванов";
        post.subscription = true;

        post.birhthday = new FormDate();
        post.birhthday.day = 13;
        post.birhthday.month = 12;
        post.birhthday.year = 2006;

    }
}
