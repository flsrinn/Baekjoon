-- 코드를 입력하세요
SELECT COUNT(*) as USERS from USER_INFO 
                where YEAR(JOINED) = 2021 and age >= 20 and age <= 29;