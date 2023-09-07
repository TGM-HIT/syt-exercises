#!/usr/bin/python3
import smtplib
import datetime
import subprocess

passwd = "PASSWORD"
user = "USER"

sender = user
recipients = "mborko@tgm.ac.at michael.borko@gmail.com".split()
subject = "RaspberryPi is now up ..."

now = datetime.datetime.now()

msg = ("From: %s\r\nTo: %s\r\nSubject: %s\r\n"
        % (sender, ", ".join(recipients), subject))

msg = msg + "Testmail generated @" + str(now) + "\r\n\r\n"
msg = msg + subprocess.check_output('ip address', shell=True).decode()

def sendmail():
    try:
        server = smtplib.SMTP_SSL('smtp.gmail.com', 465)
        server.set_debuglevel(0)
        server.ehlo()
        server.login(user, passwd)
        server.sendmail(sender, recipients, msg)
        server.quit()
        print("Email sent successfully!")
    except smtplib.SMTPAuthenticationError as e:
        print("Username and Password not accepted.")
        return False
    except:
        print("Unable to send the email!")
        return False
    return True

tries = 0
while sendmail() != True and tries < 4:
    try:
        print("Trying ... ")
        tries += 1
    except KeyboardInterrupt as e:
        print("\nUser interrupt detected ...")
        print("Email was not sent. Please check your connectivity!")
        break

