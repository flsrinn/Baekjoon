-- 코드를 입력하세요
SELECT flavor from ICECREAM_INFO 
where flavor in (SELECT flavor from FIRST_HALF where TOTAL_ORDER >= 3000)
and INGREDIENT_TYPE = 'fruit_based'
order by flavor;