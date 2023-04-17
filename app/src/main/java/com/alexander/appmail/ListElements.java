package com.alexander.appmail;

public class ListElements {
    public  String sender, subject, messageContent, summary, senderIcon;

    public ListElements(String sender, String subject, String messageContent, String summary, String senderIcon) {
        this.sender = sender;
        this.subject = subject;
        this.messageContent = messageContent;
        this.summary = summary;
        this.senderIcon = senderIcon;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSenderIcon() {
        return senderIcon;
    }

    public void setSenderIcon(String senderIcon) {
        this.senderIcon = senderIcon;
    }
}
