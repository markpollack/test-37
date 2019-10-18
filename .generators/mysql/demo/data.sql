---
conditional:
  onDependency: mysql-connector-java
actions:
  to: src/main/resources/data.sql
---
INSERT INTO EMPLOYEE VALUES (1, 'James', 'Gosling', 'Canada');

INSERT INTO EMPLOYEE VALUES (2, 'Donald', 'Knuth', 'USA');

INSERT INTO EMPLOYEE VALUES (3, 'Linus', 'Torvalds', 'Finland');

INSERT INTO EMPLOYEE VALUES (4, 'Dennis', 'Ritchie', 'USA');
