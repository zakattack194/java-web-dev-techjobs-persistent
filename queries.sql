## Part 1: Test it with SQL
    columns
        employer : varchar(255)
        id       : int
        name     : varchar(255)
        skills   : varchar(255)
## Part 2: Test it with SQL
    SELECT * FROM techjobs.employer where location = "St. Louis City";
## Part 3: Test it with SQL
    DROP TABLE job;
## Part 4: Test it with SQL
    SELECT name, description
    FROM techjobs.skill
    LEFT JOIN techjobs.job_skills ON techjobs.skill.id = techjobs.job_skills.skills_id
    where jobs_id IS NOT NULL
    ORDER BY name ASC