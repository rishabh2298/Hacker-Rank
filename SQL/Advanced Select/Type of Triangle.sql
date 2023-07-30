/*
Write a query identifying the type of each record in the TRIANGLES table using its three side lengths. Output one of the following statements for each record in the table:

Equilateral: It's a triangle with  sides of equal length.
Isosceles: It's a triangle with  sides of equal length.
Scalene: It's a triangle with  sides of differing lengths.
Not A Triangle: The given values of A, B, and C don't form a triangle.

Link : https://www.hackerrank.com/challenges/what-type-of-triangle/problem?isFullScreen=true

*/

SELECT
CASE
    WHEN GREATEST(A,B,C)*2 >= (A+B+C) THEN 'Not A Triangle'
    WHEN A=B AND B=C THEN 'Equilateral'
    WHEN A=B AND A!=C OR A=C AND A!=B THEN 'Isosceles'
    ELSE 'Scalene'
END
FROM triangles;