-- 코드를 작성해주세요
SELECT concat(QUARTER(differentiation_date), 'Q') as quarter, COUNT(*) as ecoli_count from ECOLI_DATA group by quarter order by quarter;