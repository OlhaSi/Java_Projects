package telran.dao;

import telran.data.Admin;
import telran.data.Post;
import telran.data.UserAdmin;

import java.util.Scanner;

public class Forum {
    private Post[] posts;
    private int size;
    private Admin admin;

    public Forum(int capacity, String password) {
        posts = new Post[capacity];
        size = 0;
        admin = new Admin(password);
    }

    public int getSize() {
        return size;
    }

    public boolean addPost(Post post) {
        if (size < posts.length) {
            posts[size] = post;
            size++;
            return true;
        }
        return false;
    }

    public boolean deletePost(int id) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostID() == id) {
                posts[i] = posts[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public Post[] getLastPostsByAuthor(String author, int numberOfPost) {
        Post[] authorsPosts = new Post[numberOfPost];
        int index = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (posts[i].getAuthor().getUserName().equalsIgnoreCase(author) && index < numberOfPost) {
                authorsPosts[index] = posts[i];
                index++;
            }
        }
        return authorsPosts;
    }

    public void displayPost() {
        for (int i = 0; i < size; i++) {
            System.out.println(posts[i]);
            System.out.println("----------------------------------");
        }
    }

    private int getCountLikesByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equalsIgnoreCase(title)) {
                return posts[i].getLikes();
            }
        }
        return -1;
    }

    public void printCountLikesByTitle(String title) {
        int countLikes = getCountLikesByTitle(title);
        if (countLikes >= 0) {
            System.out.println("Post " + title + " has " + countLikes + " likes");
        } else {
            System.out.println("Not found post " + title);
        }
    }

    private int getCountDisLikesByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equalsIgnoreCase(title)) {
                return posts[i].getDisLikes();
            }
        }
        return -1;
    }

    public void printCountDisLikesByTitle(String title) {
        int countDisLikes = getCountDisLikesByTitle(title);
        if (countDisLikes >= 0) {
            System.out.println("Post " + title + " has " + countDisLikes + " likes");
        } else {
            System.out.println("Not found post " + title);
        }
    }


    public void updatePostByAdminUser(int postID, Scanner scanner) {
        if (checkPassword(scanner)) {
            boolean flag = false;

            for (int i = 0; i < size; i++) {
                if (posts[i].getPostID() == postID) {
                    System.out.println("old content is " + posts[i].getContent());
                    System.out.println("enter new content");
                    posts[i].setContent(scanner.nextLine());
                    System.out.println(postID + " content change to: " + posts[i].getContent());
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println("post not found");

        } else {
            System.out.println("access is denied");

        }
    }

    public void updatePostByAdmin(int postID, Scanner scanner) {
        if (checkAdminPassword(scanner)) {
            boolean flag = false;

            for (int i = 0; i < size; i++) {
                if (posts[i].getPostID() == postID) {
                    System.out.println("old content is " + posts[i].getContent());
                    System.out.println("enter new content");
                    posts[i].setContent(scanner.nextLine());
                    System.out.println(postID + " content change to: " + posts[i].getContent());
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println("post not found");

        } else {
            System.out.println("access is denied");

        }
    }

    private boolean checkPassword(Scanner scanner) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getAuthor().getClass().getSimpleName().equals("UserAdmin")) {
                UserAdmin admin = (UserAdmin) posts[i].getAuthor();
                int count = 3;
                while (count > 0) {
                    System.out.println("enter password, please");
                    String password = scanner.nextLine();
                    if (admin.getPassword().equals(password)) {
                        return true;
                    } else {
                        count--;
                    }
                }
            }
        }
        return false;
    }

    private boolean checkAdminPassword(Scanner scanner) {
        int count = 3;
        while (count > 0) {
            System.out.println("enter password, please");
            String password = scanner.nextLine();
            if (admin.getPassword().equals(password)) {
                return true;
            } else {
                count--;
            }
        }
        return false;
    }

    public Post getPostWithMaxLikes() {
        int maxLikes = posts[0].getLikes();
        Post maxLikesPost = posts[0];
        for (int i = 1; i < size; i++) {
            if (posts[i].getLikes() > maxLikes) {
                maxLikes = posts[i].getLikes();
                maxLikesPost = posts[i];
            }
        }
        return maxLikesPost;
    }

    public Post getPostWithMaxDisLikes() {
        int maxDisLikes = posts[0].getDisLikes();
        Post maxDisLikesPost = posts[0];
        for (int i = 1; i < size; i++) {
            if (posts[i].getLikes() > maxDisLikes) {
                maxDisLikes = posts[i].getLikes();
                maxDisLikesPost = posts[i];
            }
        }
        return maxDisLikesPost;
    }
}
