package com.dipen.coding.designpatterns;

//In real systems, sending emails involves multiple optional parts: subject, body, recipients, CC, BCC, attachments, etc.
// Instead of using a constructor with 10+ parameters, Builder is perfect here.
public class BuilderExample {
    public static void main(String[] args) {
        Email email = new Email.Builder()
                .to("john.doe@example.com")
                .subject("Monthly Report")
                .body("Please find the attached report for the month.")
                .cc("manager@example.com")
                .attachment("report.pdf")
                .build();

        System.out.println(email);
    }
}
class Email {
    private final String to;
    private final String subject;
    private final String body;
    private final String cc;
    private final String bcc;
    private final String attachment;

    private Email(Builder builder) {
        this.to = builder.to;
        this.subject = builder.subject;
        this.body = builder.body;
        this.cc = builder.cc;
        this.bcc = builder.bcc;
        this.attachment = builder.attachment;
    }

    @Override
    public String toString() {
        return "Email [to=" + to + ", subject=" + subject + ", body=" + body +
                ", cc=" + cc + ", bcc=" + bcc + ", attachment=" + attachment + "]";
    }

    // Builder class
    public static class Builder {
        private String to;
        private String subject;
        private String body;
        private String cc;
        private String bcc;
        private String attachment;

        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder cc(String cc) {
            this.cc = cc;
            return this;
        }

        public Builder bcc(String bcc) {
            this.bcc = bcc;
            return this;
        }

        public Builder attachment(String attachment) {
            this.attachment = attachment;
            return this;
        }

        public Email build() {
            return new Email(this);
        }
    }
}
