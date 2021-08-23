#language:en
#Autor: Efrain Rojas

@stories
Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: Search for an automation course
        Given than Rose wants to learn automation at the academy Choucair
        | strUser   | strPassword   |
        | <strUser> | <strPassword> |
        When she search for the course on the choucair academy platform
        | strCourse    |
        | <strCourse>  |
        Then she finds the course called
        | strCourse    |
        | <strCourse>  |

        Examples:
        | strUser   | strPassword   | strCourse             |
        | 1094941992| Choucair2021* | Foundation Express    |
