Feature: Admin delete user account

  @DeleteUser
  Scenario: as an Admin, I have the authority to delete user by ID
    When I try delete user with ID 52
    Then I can delete the user account