#language:en
#Autor: Efrain Rojas

@stories
Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: Search for an automation course
        Given than brandon wants to learn automation at the academy Choucair
        | strUser       | strPassword   |
        | erojasv    | GG%2021efra |
        When he search for the course on the choucair academy platform
        | strCourse             |
        | Foundation Level |
        Then he finds the course called resources
        | strCourse             |
        | Foundation Level  |
