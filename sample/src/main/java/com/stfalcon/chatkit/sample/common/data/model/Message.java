package com.stfalcon.chatkit.sample.common.data.model;

import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.commons.models.MessageContentType;

import org.joda.time.DateTime;

import java.util.Date;

/*
 * Created by troy379 on 04.04.17.
 */
public class Message implements IMessage,
        MessageContentType.Image, /*this is for default image messages implementation*/
        MessageContentType /*and this one is for custom content type (in this case - voice message)*/ {

    private Integer id;
    private String text;
    private DateTime createdAt;
    private User user;
    private Image image;
    private Voice voice;

    public Message(Integer id, User user, String text) {
        this(id, user, text, new DateTime());
    }

    public Message(Integer id, User user, String text, DateTime createdAt) {
        this.id = id;
        this.text = text;
        this.user = user;
        this.createdAt = createdAt;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getMessage() {
        return text;
    }

    @Override
    public DateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public User getAuthor() {
        return this.user;
    }

    @Override
    public String getImageUrl() {
        return image == null ? null : image.url;
    }

    public Voice getVoice() {
        return voice;
    }

    public String getStatus() {
        return "Sent";
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public static class Image {

        private String url;

        public Image(String url) {
            this.url = url;
        }
    }

    public static class Voice {

        private String url;
        private int duration;

        public Voice(String url, int duration) {
            this.url = url;
            this.duration = duration;
        }

        public String getUrl() {
            return url;
        }

        public int getDuration() {
            return duration;
        }
    }
}
