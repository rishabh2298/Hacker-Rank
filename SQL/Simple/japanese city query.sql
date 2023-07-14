-- Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for 
-- Japan is JPN.

-- Link : https://www.hackerrank.com/challenges/japanese-cities-attributes/problem?isFullScreen=true

SELECT *
FROM city
WHERE countrycode='JPN';


-- Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for 
-- Japan is JPN.

-- Link : https://www.hackerrank.com/challenges/japanese-cities-name/problem?isFullScreen=true

SELECT name
FROM city
WHERE countrycode LIKE 'JPN';
