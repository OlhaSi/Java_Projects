package telran.controller;

import telran.dao.Forum;
import telran.data.Post;
import telran.data.User;
import telran.data.UserAdmin;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ForumApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User user1 = new User("Dan", 23);
        User user2 = new User("Mary", 25);
        User user3 = new User("Jon", 30);

        UserAdmin admin1 = new UserAdmin("Teo", 28, "QWE123");

        Post post1 = new Post(user1, "What are the top book you should read?", "Rich Dad Poor Dad by Robert Kiyosaki.");
        Post post2 = new Post(user2, "What are the top book you should read?", "The Last Lecture by Randy Pausch.");
        Post post3 = new Post(user3, "What are the top book you should read?", "Sapiens by Yuval Noah Harari.");
        Post post4 = new Post(user1, "What are the top book you should read?", "1984 by George Orwell.");
        Post post5 = new Post(user2, "What are the top book you should read?", "Think and Grow Rich by Napoleon Hill.");
        Post post6 = new Post(user3, "What are the top book you should read?", "The Power of Positive Thinking by Norman Vincent Peale.");
        Post post7 = new Post(user2, "What are the top book you should read?", "The catcher in the rye by J. D. Salinger.");
        Post post8 = new Post(user1, "What are the top book you should read?", "The Picture of Dorian Gray by Oscar Wilde.");
        Post post9 = new Post(admin1, "What are the top book you should read?", "To Kill a Mockingbird by Harper Lee.");

        post1.addLike();
        post1.disLike();
        post2.addLike();
        post3.addLike();
        post4.addLike();
        post4.addLike();
        post4.disLike();
        post5.disLike();
        post6.addLike();
        post7.disLike();
        post8.addLike();
        post8.addLike();
        post9.disLike();

        Forum askMe = new Forum(10, "hallo");
        askMe.addPost(post1);
        askMe.addPost(post2);
        askMe.addPost(post3);
        askMe.addPost(post4);
        askMe.addPost(post5);
        askMe.addPost(post6);
        askMe.addPost(post7);
        askMe.addPost(post8);
        askMe.addPost(post9);

        // askMe.displayPosts();

        //askMe.deletePost(1001);
        //askMe.display();

        Post[] authorsPosts = askMe.getLastPostsByAuthor("Dan", 3);
        //printArray(authorsPosts);
        //System.out.println(Arrays.toString(authorsPosts));
//        for (int i = 0; i < authorsPosts.length; i++) {
//            System.out.println(authorsPosts[i]);
//            System.out.println("-------------------------------");
//        }
//
//        System.out.println(askMe.getCountLikesByPostTitle("What are the top book you should read?"));
//        System.out.println(askMe.getCountDisLikesByPostTitle("What are the top book you should read?"));

//        System.out.println(post2);
//        askMe.updatePostByAdmin(10010, scanner);
//
//        scanner.close();

//        askMe.printCountDisLikesByTitle("What are the top book you should read?");
//        System.out.println(askMe.getPostWithMaxLikes());
        System.out.println(askMe.getPostWithMaxDisLikes());

    }

    public static void printArray(Object[] o) {
        for (int i = 0; i < o.length; i++) {
            if (o[i] != null) {
                System.out.println(o[i]);
            }
        }
    }
}
