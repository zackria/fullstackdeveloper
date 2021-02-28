
heroku login
heroku git:clone -a zack-kahoot
cd zack-kahoot

heroku git:remote -a zack-kahoot
git add .
git commit -am "make it better"
git push heroku master
heroku logs --tail

touch Procfile

web:node app.js


heroku restart 
