package telran.data;

public class Post {
    private User author;
    private int postID;
    private static int totalPost = 1000;
    private String title;
    private String content;
    private int likes = 0;
    private int disLikes = 0;

    public Post(User author, String title, String content) {
        this.author = author;
        this.postID = ++totalPost;
        this.title = title;
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public int getPostID() {
        return postID;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    public int getDisLikes() {
        return disLikes;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post ID: " + postID + ", posted by " + author +
                ", " + title.toUpperCase() +
                ": " + content + "\n" +
                "likes: " + likes + ", dislike: " + disLikes;
    }

    public int addLike() {
        return likes++;
    }

    public int disLike() {
        return disLikes++;
    }
}
