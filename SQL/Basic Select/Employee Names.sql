/*
    Write a query that prints a list of employee names (i.e.: the name attribute) 
    from the Employee table in alphabetical order.

    Link : https://www.hackerrank.com/challenges/name-of-employees/problem?isFullScreen=true
*/

SELECT name
FROM employee
ORDER BY name;

/*
    Employee Salaries

    Write a query that prints a list of employee names (i.e.: the name attribute) for 
    employees in Employee having a salary greater than 2000 per month who have been employees 
    for less than 10 months. Sort your result by ascending employee_id.

    Link : https://www.hackerrank.com/challenges/salary-of-employees/problem?isFullScreen=true
*/

SELECT name
FROM employee
WHERE salary > 2000 AND months < 10;
ORDER BY employee_id;