
/*
   Write the following SQL queries:
1. Name of window with AD_Window_ID = ‘100’
2. Update window with AD_Window_ID = ‘100’ appending ‘--’ to the name of
window with AD_Window_ID = ‘100’
3. List of all tabs in window with AD_Window_ID = ‘100’
   4. List of tab name + field name of all tabs in AD_Window_ID = ‘100’ sorted by tab
name and field name
5. Name and number of tabs of all windows
6. List of all windows with its number of fields, sorting by number of fields starting
by the windows with a higher number of them
7. Windows with more than 5 tabs

   */

SELECT Name FROM AD_Window WHERE AD_Window_ID = '1';
INSERT INTO AD_Window (Name) values ('3 Test Window');
SELECT Name FROM AD_Window ;
SELECT Name FROM AD_Window WHERE AD_Window_ID = '1';

UPDATE AD_Window SET Name = Name || '--' WHERE AD_Window_ID = '1';
INSERT INTO AD_Tab (Name, AD_Window_ID) values ('2Test Tab', '1');
SELECT Name FROM AD_Tab WHERE AD_Window_ID = '100';

INSERT INTO AD_Field (Name, AD_Tab_ID) values ('Test Field', '1');
/*
4. List of tab name + field name of all tabs in AD_Window_ID = ‘100’ sorted by tab
name and field name */

SELECT t.Name as TabName, f.Name as FieldName FROM AD_Tab t, AD_Field f WHERE t.AD_Tab_ID = f.AD_Tab_ID AND t.AD_Window_ID = '1' ORDER BY t.Name, f.Name;

/*
5. Name and number of tabs of all windows*/

SELECT w.Name as WindowName, count(t.AD_Tab_ID) as NumberOfTabs FROM AD_Window w, AD_Tab t WHERE w.AD_Window_ID = t.AD_Window_ID GROUP BY w.Name;


SELECT W.Name AS Window_Name, COUNT(T.AD_Tab_ID) AS Tab_Count
FROM AD_Window W
         LEFT JOIN AD_Tab T ON W.AD_Window_ID = T.AD_Window_ID
GROUP BY W.Name;


/*
6. List of all windows with its number of fields, sorting by number of fields starting
by the windows with a higher number of them */


SELECT W.Name AS Window_Name, COUNT(F.AD_Field_ID) AS Field_Count
FROM AD_Window W
         LEFT JOIN AD_Tab T ON W.AD_Window_ID = T.AD_Window_ID
         LEFT JOIN AD_Field F ON T.AD_Tab_ID = F.Ad_Tab_ID
GROUP BY W.Name
ORDER BY Field_Count DESC;
/*
7. Windows with more than 5 tabs */

SELECT W.Name AS Window_Name
FROM AD_Window W
         LEFT JOIN AD_Tab T ON W.AD_Window_ID = T.AD_Window_ID
GROUP BY W.Name
HAVING COUNT(T.AD_Tab_ID) > 5;


/*
6. List of all windows with its number of fields, sorting by number of fields starting
by the windows with a higher number of them */

SELECT W.Name AS Window_Name, COUNT(F.AD_Field_ID) AS Field_Count FROM AD_Window W LEFT JOIN AD_Tab T ON W.AD_Window_ID = T.AD_Window_ID LEFT JOIN AD_Field F ON T.AD_Tab_ID = F.Ad_Tab_ID GROUP BY W.Name ORDER BY Field_Count DESC;