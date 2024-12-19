# Autor: Ricardo Hurtado
Feature: As a recruiter, I want to record the details of a new employee.

Scenario: Successful new employee registration

    Given the recruiter opens the website
    When the recruiter enters the credentials
    And the recruiter fills in the employee's details in the form
    Then the employee details match the ones entered in the forms
    And the status is Hired