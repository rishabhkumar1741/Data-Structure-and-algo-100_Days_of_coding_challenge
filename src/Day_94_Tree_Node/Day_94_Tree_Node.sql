-- # Write your MySQL query statement below

SELECT id, 'Root' as Type FROM Tree 
WHERE p_id IS NULL
UNION
SELECT id, 'Leaf' AS Type FROM Tree 
WHERE id NOT IN (SELECT p_id FROM Tree WHERE p_id IS NOT NULL) AND p_id IS NOT NULL
UNION
SELECT
    id,'Inner' as Type
FROM
    tree
WHERE
    id IN (SELECT p_id FROM tree WHERE p_id IS NOT NULL) AND p_id IS NOT NULL
ORDER BY id;

