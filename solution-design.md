# {Customer Name} {Solution Name} Solution Design

## Relevant Documents & Links

| **Document**                                         | **Reference**                                       |
| ---------------------------------------------------- | --------------------------------------------------- |
| *Title of document that is referenced in the design* | *Link to document that is referenced in the design* |

## Overview

<!-- Ensure the below is updated and this comment removed -->

*Define the overview of the solution and the objectives of the solution the design will look to solve.*

## Table of Contents

- [{Customer Name} {Solution Name} Solution Design](#customer-name-solution-name-solution-design)
  - [Relevant Documents \& Links](#relevant-documents--links)
  - [Overview](#overview)
  - [Table of Contents](#table-of-contents)
  - [Scope](#scope)
    - [In Scope](#in-scope)
    - [Out of Scope](#out-of-scope)
  - [Assumptions \& Dependencies](#assumptions--dependencies)
    - [Assumptions](#assumptions)
    - [Dependencies](#dependencies)
  - [Risks](#risks)
  - [Requirements](#requirements)
  - [Solution Architecture](#solution-architecture)
    - [Service Component 1](#service-component-1)
    - [Service Component 2](#service-component-2)
    - [Service Component 3](#service-component-3)
    - [CI/CD Services](#cicd-services)
    - [Observability Services](#observability-services)
    - [Network Services](#network-services)
      - [Network Flow Summary](#network-flow-summary)
    - [Identity \& Access Management](#identity--access-management)
    - [Backup Services](#backup-services)
    - [Disaster Recovery](#disaster-recovery)
    - [Foundation Services](#foundation-services)
    - [Alternatives Considered](#alternatives-considered)
    - [Measuring Success](#measuring-success)
    - [Cost Analysis](#cost-analysis)
    - [Future Improvements](#future-improvements)
    - [Solution Delivery](#solution-delivery)

## Scope

> **Note 📝** Details for what is in scope which should of been discovered through Long Range Planning and Discovery event using the Pod Delivery Framework

### In Scope

The scope of the solution design document is defined in the below table:

| **ID** | **Description**                                                                |
| ------ | ------------------------------------------------------------------------------ |
| SC01   | *Define solution design using only AWS platform native service where possible* |
| SC02   | *Define solution to integrate with customers IdP platform*                     |
| SC03   | *Define solution design for CI/CD services*                                    |

### Out of Scope

The document does not refer to any of the following items:

| **ID** | **Description**                                              |
| ------ | ------------------------------------------------------------ |
| OSC01  | *Penetration testing for service defined in solution design* |
| OSC02  | *Definition of design to enable Disaster Recovery*           |
| OSC03  | *Definition of design for Domain Name Services*              |

## Assumptions & Dependencies

<!-- Ensure the below note and this comment is removed -->

> **Note 📝** Details of assumption and dependencies which should of been defined through Long Range Planning and Discovery event, when following the Pod Delivery Framework

### Assumptions

| **ID** | **Description**                                                     |
| ------ | ------------------------------------------------------------------- |
| AS01   | *Foundation Services will only leverage AWS native services*        |
| AS02   | *Observability solution will be deployed by the customer*           |
| AS03   | *Direct Connect will be the primary service for connecting on-prem* |

### Dependencies

Table of dependencies that are considered for this solution design:

| **ID** | **Description**                                               |
| ------ | ------------------------------------------------------------- |
| DE01   | *Foundation Services will designed by the customer*           |
| DE02   | *On-prem connectivity will be established by the customer*    |
| DE03   | *Soultion design for service will be defined by the customer* |

## Risks

> **Note 📝** Details of risks which should of been defined through Long Range Planning and Discovery event, when following Pod Delivery Framework

| **ID** | **Description**                                                                                      |
| ------ | ---------------------------------------------------------------------------------------------------- |
| RI01   | *Access that has been granted to Rackspace may not be suffcient and could cause delays*              |
| RI02   | *Due to issue of overlapping CIDR ranges deployed solution may not fufill target state requirements* |
| RI03   | *Security standards may be driven by customers security organisation which may cause delays*         |

## Requirements

> **Note 📝** Details for what is in scope which should of been defined through Long Range Planning and Discovery event when following the Pod Delivery Framework. Requirements can be gathered through workshops or ad-hoc meetings with our customers

| Req ID | Requirement | Alignment      | Requirement Type | Requirement Requester | Comments |
| ------ | ----------- | -------------- | ---------------- | --------------------- | -------- |
| R01    |             | Operations     | Non-functional   |                       |          |
| R02    |             | Infrastructure | Functional       |                       |          |
| R03    |             | Migration      | Technical        |                       |          |
| R04    |             | Automation     | Non-functional   |                       |          |
| R05    |             | Optimisation   | Functional       |                       |          |
| R06    |             | Reliability    | Technical        |                       |          |
| R07    |             | Security       | Non-functional   |                       |          |
| R08    |             | Sustainability | Functional       |                       |          |

## Solution Architecture

> **Note 📝** Solution architecture that is defined through the Design event when following the Pod Delivery Framework. Not all services will be required, use what is defined below as a starting point, add and remove to align with customer requirements.

*Insert diagram created using Lucid Chart and define a high-level summary of the design to meet requirements*

### Service Component 1

*Summary of the component used in solution architecture and justification for design decision to meet requirements*

### Service Component 2

*Summary of the component used in solution architecture and justification for design decision to meet requirements*

### Service Component 3

*Summary of the component used in solution architecture and justification for design decision to meet requirements*

### CI/CD Services

*Details of how CI/CD services will be used in solution architecture  and justification for design decisions to meet requirements*

### Observability Services

*Details of how observability (monitoring & logging) services will be used in solution architecture  and justification for design decisions to meet requirements*

### Network Services

*Details of how network services will be used in solution architecture  and justification for design decisions to meet requirements*

#### Network Flow Summary

> **Note 📝** The below table can be used to detail the network flow that is detailed in the architecture diagram

| **ID** | **Description**                                              |
| ------ | ------------------------------------------------------------ |
| FL01   | _Data is sent from database to application tier_             |
| FL02   | _Service sends data to AWS S3 using S3 Gateway_              |
| FL03   | _Service calls IdP solution to allow for user authenication_ |

### Identity & Access Management

*Details of how identity services will be used in solution architecture  and justification for design decisions to meet requirements*

### Backup Services

*Details of how backup services will be used solution architecture  and justification for design decisions to meet requirements*

### Disaster Recovery

*Details of how disaster recovery is defined for the solution architecture  and justification for design decisions to meet requirements*

### Foundation Services

*Details of how foundation services (NTP, Jump Servers, Proxy, Patch Management etc.) will be designed for the solution design and justification for design decisions to meet requirements*

### Alternatives Considered

> **Note 📝** Talk about all the different design alternatives – a combination of different Infrastructure platforms, databases, service frameworks, logical approaches, etc – you considered and mention the recommended one which you think will be best suited for this project and why. A table with pros and cons including columns like cost, scalability, ease of use, latency, maintainability, and community support is a good way to judge the best services and platforms to use for this design

### Measuring Success

> **Note 📝** This should give an overview of the outcomes and business value that will be delivered for our customers. This should define qualitative and quantitative metrics where applicable. Eg: By implementing this solution Acme will save X amount of engineering hours by automating X process which will, in turn, enable engineers to focus X amount of time doing X.

### Cost Analysis

> **Note 📝**  When additional costs will be added to a customers cloud bill, the analysis should be conducted and documented to estimate additional costs for the solution outlined in this design

### Future Improvements

> **Note 📝** This section talks about the features which the users can expect in future releases. Talk about different features you plan to roll out and what that timeline can look like.

### Solution Delivery

> **Note 📝** Note: Details for each of the Jira issues and their assignees should be added here. It is said that there is no definition of how many issues need to completed for each event (Discovery, Design, etc.) within the Pod Delivery Framework. This will be dependent on the needs of the Pod and the Customer.

| **Event** | **Jira Issue** | **Assignee** |
| --------- | -------------- | ------------ |
| Discovery |                |              |
| Design    |                |              |
| Develop   |                |              |
| Validate  |                |              |
| Publish   |                |              |
