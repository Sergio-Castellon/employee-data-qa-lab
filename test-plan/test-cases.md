
# Employee Registration — Manual Test Cases

## Project Overview

This document contains manual QA test cases for a simulated employee registration application, developed as part of an introductory software QA learning project.

These test cases demonstrate positive testing, negative testing, boundary value testing, and test case documentation.

## Application Requirements

- REQ-001: First name is required.
- REQ-002: Email must be present and have a valid format.
- REQ-003: Age must be between 18 and 65, inclusive.
- REQ-004: Successful registration displays confirmation and creates an employee record.
- REQ-005: Invalid registration must be rejected without creating an employee record.

---

## TC-001 — Minimum Valid Age

**Testing Type:** Positive / Boundary Value Testing

**Preconditions:** The employee registration form is available and accessible.

**Test Data:**
- First Name: John
- Email: john@example.com
- Age: 18

**Test Steps:**
1. Open the employee registration form.
2. Enter "John" in the First Name field.
3. Enter "john@example.com" in the Email field.
4. Enter "18" in the Age field.
5. Click Register.

**Expected Result:** Registration succeeds, a confirmation message appears, and an employee record is created.

**Actual Result:** Not observed.

**Status:** Not Run.

---

## TC-002 — Missing Email Address

**Testing Type:** Negative Testing

**Preconditions:** The employee registration form is available and accessible.

**Test Data:**
- First Name: John
- Email: Blank
- Age: 25

**Test Steps:**
1. Open the employee registration form.
2. Enter "John" in the First Name field.
3. Leave the Email field blank.
4. Enter "25" in the Age field.
5. Click Register.

**Expected Result:** Registration is rejected, an email-required validation message appears, and no employee record is created.

**Actual Result:** Not observed.

**Status:** Not Run.

---

## TC-003 — Maximum Valid Age

**Testing Type:** Positive / Boundary Value Testing

**Preconditions:** The employee registration form is available and accessible.

**Test Data:**
- First Name: Sergio
- Email: sergio@email.com
- Age: 65

**Test Steps:**
1. Open the employee registration form.
2. Enter "Sergio" in the First Name field.
3. Enter "sergio@email.com" in the Email field.
4. Enter "65" in the Age field.
5. Click Register.

**Expected Result:** Registration succeeds, a confirmation message appears, and an employee record is created.

**Actual Result:** Not observed.

**Status:** Not Run.

---

## TC-004 — Invalid Email Format

**Testing Type:** Negative Testing

**Preconditions:** The employee registration form is available and accessible.

**Test Data:**
- First Name: Maria
- Email: not-an-email
- Age: 30

**Test Steps:**
1. Open the employee registration form.
2. Enter "Maria" in the First Name field.
3. Enter "not-an-email" in the Email field.
4. Enter "30" in the Age field.
5. Click Register.

**Expected Result:** Registration is rejected, an invalid-email validation message appears, and no employee record is created.

**Actual Result:** Not observed.

**Status:** Not Run.

---

## TC-005 — Age Above Maximum

**Testing Type:** Negative / Boundary Value Testing

**Preconditions:** The employee registration form is available and accessible.

**Test Data:**
- First Name: Alex
- Email: alex@example.com
- Age: 66

**Test Steps:**
1. Open the employee registration form.
2. Enter "Alex" in the First Name field.
3. Enter "alex@example.com" in the Email field.
4. Enter "66" in the Age field.
5. Click Register.

**Expected Result:** Registration is rejected, an age-validation message appears, and no employee record is created.

**Actual Result:** Not observed.

**Status:** Not Run.

---

## Notes

These test cases were created for educational purposes as part of the Employee Data QA Lab.

The application requirements are hypothetical, and the test cases have not yet been executed against a working application.

All test execution statuses remain "Not Run" until the tests are performed and their actual results are documented.
