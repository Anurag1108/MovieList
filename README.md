Movie List

Application that displays a list of more than 10,000 Movies and TV shows using Modern Android Application Development tools and API's

The App Makes a request to TMDB's API to get:

A list of the current popular, now_playing, upcoming, and top_rated movies on TMDb. /movie/{category}

List of official genres for movies. /genre/movie/list
List of user reviews for a movie. /movie/{movie_id}/reviews
The cast and crew for a movie. /movie/{movie_id}/credits
The videos(trailers, behind the Scenes, & bloopers) that have been added to a movie. /movie/{movie_id}/videos
A specific movie. /search/movie
A list of the current popular, airing_today, on_the_air, and top_rated TV shows on TMDb. /tv/{category}

List of official genres for TV shows. /genre/tv/list
List of user reviews for a TV show. /tv/{tv_id}/reviews
The cast and crew for a TV show. /tv/{tv_id}/credits
The videos(trailers, behind the Scenes, & bloopers) that have been added to a TV Show. /tv/{tv_id}/videos
A specific TV show. /search/tv
Primary person details by id. /person/{person_id}

Movie credits for a person. /person/{person_id}/movie_credits
TV show credits for a person. /person/{person_id}/tv_credits
Base URL = "https://api.themoviedb.org/3/"
