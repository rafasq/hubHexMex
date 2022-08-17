SELECT FILM.TITLE, language.NAME AS 'LNAGUAGE' ,CATEGORY.NAME CATEGORY FROM
    FILM
        INNER JOIN language ON FILM.language_id = language.language_id
        INNER JOIN film_category ON FILM.FILM_id = film_category.film_id
        INNER JOIN category ON category.category_id = film_category.category_id
WHERE  category.name = 'Music';

DROP PROCEDURE GET_MOVIE_DETAILS;
DELIMITER $$
CREATE PROCEDURE  GET_MOVIE_DETAILS(CATEGORY_NAME_IN CHAR(50))
BEGIN
    SELECT FILM.TITLE, language.NAME AS 'LNAGUAGE' ,CATEGORY.NAME CATEGORY FROM
        FILM
            INNER JOIN language ON FILM.language_id = language.language_id
            INNER JOIN film_category ON FILM.FILM_id = film_category.film_id
            INNER JOIN category ON category.category_id = film_category.category_id
    WHERE  category.name = CATEGORY_NAME_IN ;
END$$
DELIMITER ;

CALL GET_MOVIE_DETAILS('ANIMATION');
