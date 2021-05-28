A json file containing 216,930 Jeopardy questions, answers and other data. See the bottom of the post for a CSV verson. The format of the json object is described below. Questions were obtained by crawling www.j-archive.com [OC]

According to j-archive, the total number of Jeopardy! questions over the show's span (as of this post) is 252,583 - so this is approximately 83% of them. In particular, around the last two years of game play are missing.

The json file is an unordered list of questions where each question has

'category' : the question category, e.g. "HISTORY"

'value' : $ value of the question as string, e.g. "$200"

Note: This is "None" for Final Jeopardy! and Tiebreaker questions

'question' : text of question

Note: This sometimes contains hyperlinks and other things messy text such as when there's a picture or video question

'answer' : text of answer

'round' : one of "Jeopardy!","Double Jeopardy!","Final Jeopardy!" or "Tiebreaker"

Note: Tiebreaker questions do happen but they're very rare (like once every 20 years)

'show_number' : string of show number, e.g '4680'

'air_date' : the show air date in format YYYY-MM-DD

I'd love to hear of anything that gets done with this! Let me know! :D

I was thinking it would be cool to have a site where you could sort/search all of the questions in a bunch of different ways, such as only $1000+ questions or only category "WORLD CAPITALS". Also, somehow using this for a reddit bot could be interesting with the right idea.
