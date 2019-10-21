# ClickUp-Java
![build version](https://img.shields.io/badge/version-0.1.0--alpha-brightgreen.svg)
![release version](https://img.shields.io/badge/release-v0.1.0--alpha-blue.svg)
![framework or language](https://img.shields.io/badge/Java-1.5-blue.svg)
![license](https://img.shields.io/badge/license-AGPL--3.0-lightgrey.svg)

### Current Version 0.1.0-alpha
### Development Version 0.1.0-alpha

## About
ClickUp-Java is a library to interact with the [ClickUp](https://clickup.com/) API (ClickUp 2.0). The library is programed in Java.

##### Info: 
- English isn’t my first language, so please excuse any mistakes.
- Contact me for proposals or questions.
- This project uses the library [Gson](https://github.com/google/gson) for JSON interactions.

## Getting Started
1. add ClickUp-Java to your project
2. add Gson 2.4 or higher to your project

## Usage
### API Calls
A list of available API calls of the ClickUp API. For more information [click here](https://clickup.com/api).
| API Call | Method | Return/.obj() Type |
|----------|--------|--------------|
|Get Access Token|getAccessToken(String clientId, String clientSecret, String code)|Boolean|
|Get Authorized User|getAuthorizedUser()|CUUser|
|Get Authorized Teams|getAuthorizedTeams()|ArrayList\<CUTeams\>|
|Get Teams|getTeams()|ArrayList\<CUTeams\>|
|Create Space|createSpace(Long teamID, CUSpace space)|CUSpace|
|Update Space|updateSpace(Long spaceID, CUSpace space)|CUSpace|
|Delete Space|deleteSpace(Long spaceID)|Boolean|
|Get Spaces|getSpaces(Long teamID, Boolean archived)|ArrayList\<CUSpace\>|
|Get Space|getSpace(Long spaceID)|CUSpace|
|Create Folder|createFolder(Long spaceID, CUFolder folder)|CUFolder|
|Update Folder|updateFolder(Long folderID, CUFolder folder)|CUFolder|
|Delete Folder|deleteFolder(Long folderID)|Boolean|
|Get Folders|getFolders(Long spaceID, Boolean archived)|ArrayList\<CUFolder\>|
|Get Folder|getFolder(Long folderID)|CUFolder|
|Create List|createList(Long folderID, CUList list)|CUList|
|Create Folderless List|createFolderlessList(Long spaceID, CUList list)|CUList|
|Update List|updateList(String listID, CUList list)|CUList|
|Delete List|deleteList(Long listID)|Boolean|
|Get Lists|getLists(Long folderID, Boolean archived)|ArrayList\<CUList\>|
|Get Folderless Lists|getFolderlessLists(Long spaceID, Boolean archived)|ArrayList\<CUList\>|
|Get List|getList(Long listID)|CUList|
|Create Task|createTask(Long listID, CUTask task)|CUTask|
|Update Task|updateTask(String taskID, CUTask task)|CUTask|
|Delete Task|deleteTask(String taskID)|Boolean|
|Get Tasks|getTasks(Long listID, Boolean archived)|ArrayList\<CUTask\>|
|Get Task|getTask(String taskID)|CUTask|
|Get List Members|getListMembers(Long listID)|ArrayList\<CUMember\>|
|Get Task Members|getTaskMembers(String taskID)|ArrayList\<CUMember\>|

### Examples

#### Initialize ClickUp-Java
```java
ClickUp clickUp = new ClickUp("<Client Id>", "<Client Secret>", "<Code>");
```

#### Initialize ClickUp-Java with API Token
```java
ClickUp clickUp = new ClickUp("<API Token>");
```

#### Get Tasks as JSON
```java
System.out.println(clickUp.getTasks((long) 1111111, false).json());
```

#### Get Tasks as object
```java
System.out.println(((ArrayList<CUTask>) clickUp.getTasks((long) 1111111, false).obj()).get(0).getName());
```

#### Delete Task
```java
if (clickUp.deleteTask("00a0aa")) {
	System.out.println("Task deleted");
}
```


## Dependencies
### Runtime Dependencies
- Java 1.5 or higher
- Gson 2.4 or higher 
### Development Dependencies
- Java 1.5
- Gson 2.4

## Changelog
### = 0.1.0-alpha October 21st 2019 =
#### Added
- API Call: Get Access Token
- API Call: Get Authorized User
- API Call: Get Authorized Teams
- API Call: Get Teams
- API Call: Create Space
- API Call: Update Space
- API Call: Delete Space
- API Call: Get Spaces
- API Call: Get Space
- API Call: Create Folder
- API Call: Update Folder
- API Call: Delete Folder
- API Call: Get Folders
- API Call: Get Folder
- API Call: Create List
- API Call: Create Folderless List
- API Call: Update List
- API Call: Delete List
- API Call: Get Lists
- API Call: Get Folderless Lists
- API Call: Get List
- API Call: Create Task
- API Call: Update Task
- API Call: Delete Task
- API Call: Get Tasks
- API Call: Get Task
- API Call: Get List Members
- API Call: Get Task Members
- Object: CUAttachment
- Object: CUChecklist
- Object: CUChecklistItem
- Object: CUCustomField
- Object: CUFolder
- Object: CUList
- Object: CUMember
- Object: CUSpace
- Object: CUStatus
- Object: CUTag
- Object: CUTask
- Object: CUTeam
- Object: CUWebhook
- Object: CUFeatures
- Object: CUOption
- Object: CUPriority
- Object: CUTypeConfig
- Object: CUFChecklists
- Object: CUFCheckUnresolved
- Object: CUFCustomFields
- Object: CUFDependencyWarning
- Object: CUFDueDates
- Object: CUFPortfolios
- Object: CUFPriorities
- Object: CUFRemapDependencies
- Object: CUFTags
- Object: CUFTimeEstimates
- Object: CUFTimeTracking


## Support Possibilities
- give proposals
- report bugs

## License
ClickUp-Java is released under the [AGPL-3.0](https://www.gnu.org/licenses/agpl-3.0.de.html) License.
