/*
Revising Sql query-1

Query all columns for all American cities in the CITY table with populations larger 
than 100000. The CountryCode for America is USA.
The CITY table is described as follows:

Link : https://www.hackerrank.com/challenges/revising-the-select-query/problem?isFullScreen=true

*/

select
*
from city
where countryCode='USA' AND population>=100000;


/*
Revising Sql query-2

Query the NAME field for all American cities in the CITY table with populations 
larger than 120000. The CountryCode for America is USA.

Link : https://www.hackerrank.com/challenges/revising-the-select-query-2/problem?isFullScreen=true

*/

select
NAME
from city
where countrycode='USA' AND population>120000;