package lld.twitter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

class User {
    private final String userId;
    private String name;
    private Set<User> followers;
    private Set<User> following;
    private List<Tweet> tweets;

    public User(String userId) {
        this.userId = userId;
    }

    public void follow(User user) {
        if (user != null && !userId.equals(user.userId)) {
            following.add(user);
            user.followers.add(this);
        }
    }

    public void unfollow(User user) {
        following.remove(user);
        user.followers.remove(this);
    }

    public Tweet postTweet(String content) {
        Tweet tweet = new Tweet(UUID.randomUUID().toString(), this, content);
        tweets.add(tweet);
        return tweet;
    }

    public List<Tweet> getTimeline() {
        List<Tweet> timeline = new ArrayList<>(tweets);
        for (User user : following) {
            timeline.addAll(user.tweets);
        }
        timeline.sort(Comparator.comparing(Tweet::getCreatedAt).reversed());
        return timeline;
    }
}

class Tweet {
    private final String id;
    private String content;
    private User author;
    private LocalDate createdAt;
    private List<Comment> comments;

    public Tweet(String id, User author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.createdAt = LocalDate.now();
    }

    public void updateContent(String content) {
        this.content = content;
    }

    public Comment addComment(User user, String text) {
        Comment comment = new Comment(UUID.randomUUID().toString(), this, user, text);
        comments.add(comment);
        return comment;
    }

    public void deleteComment(String commentId, User user) {
        comments.removeIf(comment ->
            comment.getCommentId().equals(commentId) &&
                    comment.getAuthor().equals(user)
        );
    }

    public List<Comment> getComments() {
        return new ArrayList<>(comments);
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }
}

class Comment {
    private final String commentId;
    private String content;
    private Tweet tweet;
    private User author;
    private String text;
    private LocalDateTime createdAt;

    public Comment(String commentId, Tweet tweet, User author, String text) {
        this.commentId = commentId;
        this.tweet = tweet;
        this.author = author;
        this.text = text;
        this.createdAt = LocalDateTime.now();
    }

    public void edit(String text) {
        this.text = text;
    }

    public String getCommentId() {
        return commentId;
    }

    public User getAuthor() {
        return author;
    }
}

public class TwitterApp {
}
