package com.example.mailtitleinterface.data

import com.example.mailtitleinterface.model.Mail

class MailList {
    fun loadMails(): List<Mail> {
        return listOf(
            Mail("First mail", "6:40 PM", "le.ba.vui@gmail.com"),
            Mail("Second mail", "05:55 PM", "cr7@hust.soict.edu.vn"),
            Mail("Help Me", "04:45 PM", "huy@gmail.com"),
            Mail("Let's eat lunch!", "01:20 PM", "quang.com"),
            Mail("Thank you for joining", "11:45 AM", "mark@facebook.com"),
            Mail("Coding Test Result", "10:55 AM", "recruitment@yahoo.com"),
            Mail("Your booking is successful", "09:00 AM", "goldenhotel@gmail.com"),
            Mail("You haven't used Linkedin 1 week!", "8:30 AM", "john@linkedin.com"),
            Mail("Last mail", "7:35 PM", "last@gmail.com"),
        )
    }
}