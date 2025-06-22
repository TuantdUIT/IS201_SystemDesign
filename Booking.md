# Hotel Management System - Booking Process

## Overview

This document outlines the booking process for a Hotel Management System, designed to facilitate customers in reserving rooms or services. The system follows a structured workflow, ensuring seamless interaction between customers and hotel staff. The process includes user authentication, order submission for rooms or services, staff verification, and invoice generation.

## System Design Workflow

The booking process is divided into distinct steps, from customer login to invoice creation. Below is the detailed workflow:

### 1. User Authentication

- **Login**:
  - Customers must log in to the system to initiate a booking.
  - They provide credentials (e.g., username and password) to access their account.
- **Registration**:
  - If a customer does not have an account, they can create one by selecting the "Register" option.
  - Registration requires providing personal details (e.g., name, email, phone number, and password).
  - After successful registration, the customer can log in immediately.

### 2. Order Submission

After successful login, customers can place an order for either **rooms** or **services**. Each order type requires specific information:

#### Room Booking Order

- **Required Information**:
  - **Number of People**: The total number of guests staying in the room(s).
  - **Number of Rooms**: The quantity of rooms required.
  - **Day Started**: The check-in date.
  - **Day Ended**: The check-out date.
  - **Request**: Any special requirements (e.g., room type, view, accessibility needs).
- The customer submits the order through the system interface.

#### Service Booking Order

- **Required Information**:
  - **Amount of Usage**: The quantity or extent of the service required (e.g., number of spa sessions, meals).
  - **Day Started**: The date the service is needed.
  - **Day Ended**: Optional; specifies the end date for services spanning multiple days (e.g., car rental).
  - **Request**: Any specific requirements (e.g., dietary restrictions for meals, preferred service time).
- The customer submits the service order via the system.

### 3. Staff Processing

- **Order Receipt**:
  - Hotel staff receive the customer's order through the system's staff dashboard.
- **Availability Check**:
  - Staff verify the availability of requested rooms or services based on current status:
    - For rooms: Check room occupancy for the specified dates.
    - For services: Confirm resource availability (e.g., staff, equipment) for the requested period.
- **Customer Communication**:
  - Staff contact the customer (e.g., via phone or email) to discuss the request.
  - They confirm whether the requirements can be met or propose alternatives if necessary.
  - The customer approves or modifies the request.

### 4. Invoice Creation

- **Order Confirmation**:
  - Once the customer’s requirements are accepted, staff proceed to generate an invoice.
- **Invoice Workflow**:
  - If no invoice exists for the customer:
    - Staff create a new invoice linked to the customer’s account.
  - Staff add details to the invoice, including:
    - **Room Details**: Room type, number of rooms, duration, and cost.
    - **Service Details**: Service type, quantity, duration (if applicable), and cost.
  - The invoice is finalized and sent to the customer for payment or stored in the system for checkout.

## Key Features

- **User-Friendly Authentication**: Simple login and registration process for customers.
- **Flexible Order Types**: Supports both room and service bookings with customizable requests.
- **Real-Time Staff Processing**: Staff can check availability and communicate with customers efficiently.
- **Invoice Management**: Automated invoice creation and detailed breakdown of charges.
- **Scalable Design**: The system can handle multiple customers and orders concurrently.
