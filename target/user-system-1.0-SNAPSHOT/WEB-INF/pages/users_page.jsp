<%--
  Created by IntelliJ IDEA.
  User: akuzikov
  Date: 9/19/18
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--<title>Title</title>--%>
            <%--<meta http-equiv="content-type" content="text/html; charset=utf-8">--%>
            <title>FirstWeb</title>
<style  type="text/css">
    body{
        background-image: url("/home/akuzikov/IdeaProjects/_123/src/main/webapp/WEB-INF/pages/derev.jpg");
    }

</style>



</head>


<body background = "/home/akuzikov/IdeaProjects/_123/src/main/webapp/WEB-INF/Images/derev.jpg" >
Hello motherfucka :)
<%--<p>--%>
    <%--<img class="rg_ic rg_i" id="ycUvICtKTwuDpM:" jsaction="load:str.tbn" alt="Картинки по запросу mem"--%>
         <%--onload="typeof google==='object'&amp;&amp;google.aft&amp;&amp;google.aft(this)"--%>
         <%--src="data:image/png;base64,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"--%>
         <%--style="width: 180px; height: 180px; margin-left: 4px; margin-right: 5px; margin-top: -5px;">--%>

<%--</p>--%>

<%--<h1>--%>
    <%--<img class="irc_mi" src="https://www.sovremennik.mk.ua/posts/img/origin/188-Memkultura-v-kazhdom-iz-nas.jpg"--%>
         <%--alt="Картинки по запросу mem" onload="typeof google==='object'&amp;&amp;google.aft&amp;&amp;google.aft(this)"--%>
         <%--width="540" height="353" style="margin-top: 0px;">--%>
<%--</h1>--%>


</body>
</html>
