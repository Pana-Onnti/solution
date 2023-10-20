SELECT Name FROM AD_Window WHERE AD_Window_ID = '100';
UPDATE AD_Window SET Name = Name || '--' WHERE AD_Window_ID = '100';
SELECT Name FROM AD_Tab WHERE AD_Window_ID = '100';
SELECT t.Name as TabName, f.Name as FieldName FROM AD_Tab t, AD_Field f WHERE t.AD_Tab_ID = f.AD_Tab_ID AND t.AD_Window_ID = '100' ORDER BY t.Name, f.Name;
SELECT W.Name AS Window_Name, COUNT(T.AD_Tab_ID) AS Tab_Count
FROM AD_Window W
         LEFT JOIN AD_Tab T ON W.AD_Window_ID = T.AD_Window_ID
GROUP BY W.Name;
SELECT W.Name AS Window_Name, COUNT(F.AD_Field_ID) AS Field_Count
FROM AD_Window W
         LEFT JOIN AD_Tab T ON W.AD_Window_ID = T.AD_Window_ID
         LEFT JOIN AD_Field F ON T.AD_Tab_ID = F.Ad_Tab_ID
GROUP BY W.Name
ORDER BY Field_Count DESC;
SELECT W.Name AS Window_Name
FROM AD_Window W
         LEFT JOIN AD_Tab T ON W.AD_Window_ID = T.AD_Window_ID
GROUP BY W.Name
HAVING COUNT(T.AD_Tab_ID) > 5;
