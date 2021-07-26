# fullstackdeveloper
Full Stack Developer Training

### **Install:** Apache Webserver to be installed 

# MacOS

- Start / Stop / Restart Apache WebServer in MacOS

`sudo /usr/sbin/apachectl start`

`sudo /usr/sbin/apachectl stop`

`sudo /usr/sbin/apachectl restart`


- Mac Document Location (DocumentRoot)

`/Library/WebServer/Documents`

- Configuration is located on

`/private/etc/apache2/httpd.conf`


# Windows 10

### Download Apache Binaries from Apache Lounge Installation
- Apache Lounge Download Link [https://www.apachelounge.com/download/](https://www.apachelounge.com/download/)
#### :memo:  Microsoft C++ Redistributable for Visual Studio 2012 Update 4 / Microsoft C++ Redistributable for Visual Studio 2015 to be pre-installed before installing Apache Lounge

- Windows Document Location (DocumentRoot)

`C:\Apache24\htdocs`

- Configuration is located on 

`C:\Apache24\conf\httpd.conf`

# Linux CentOS
- Open Terminal and execute the following commands

`sudo dnf check-update`

`sudo dnf install httpd`

`sudo firewall-cmd --permanent --add-service=https`

`sudo firewall-cmd --reload`

`sudo systemctl start httpd`

`sudo systemctl status httpd`

`hostname -I`

- Document Location (DocumentRoot)

`/var/www/html/`

- Configuration is located on

`/etc/httpd/httpd.conf`

#### :memo: Custom Apache or Nginx Configurations

`/etc/httpd/conf.d/welcome.conf`

`/etc/nginx/nginx.conf`

`sudo systemctl stop httpd`

`sudo systemctl restart httpd`

`sudo systemctl reload httpd`

- Stop auto start when server boots

`sudo systemctl disable httpd`

- Start auto start when server boots

`sudo systemctl enable httpd`

#### :memo:  Old CentOS below 7 steps as below

`sudo yum install httpd`

`systemctl start httpd`

`systemctl status httpd`

`systemctl restart httpd`

- Reference [https://www.digitalocean.com/community/tutorials/how-to-install-the-apache-web-server-on-centos-8](https://www.digitalocean.com/community/tutorials/how-to-install-the-apache-web-server-on-centos-8)

# Linux Ubuntu
- Open Terminal and execute the folllowing commands 

 `sudo apt update`

 `sudo apt install apache2`

 `sudo service apache2 status`

 `sudo service apache2 stop`

 `sudo service apache2 start`

 `sudo service apache2 restart`


- Document Location (DocumentRoot)

`/var/www/html/`

- Configuration is located on

`/etc/apache2/httpd.conf`

- Reference [https://ubuntu.com/tutorials/install-and-configure-apache#1-overview](https://ubuntu.com/tutorials/install-and-configure-apache#1-overview)


# Troubleshooting

- VMWare CentOS  Internet Fix

`ifconfig`

`dhclient –v`

`chmod 755 net-autostart`

`chkconfig --add net-autostart`

[https://geekflare.com/no-internet-connection-from-vmware-with-centos-7/](https://geekflare.com/no-internet-connection-from-vmware-with-centos-7/)