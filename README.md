# ClickUp-Java
![build version](https://img.shields.io/badge/version-0.2.0--alpha-brightgreen.svg)
![framework or language](https://img.shields.io/badge/Java-1.5-blue.svg)
![license](https://img.shields.io/badge/license-AGPL--3.0-lightgrey.svg)

## About
ClickUp-Java is a (unofficial) library to interact with the [ClickUp](https://clickup.com/) API (ClickUp 2.0). If you have any suggestions or questions contact me or create a feature request/bug report.

##### Info:
- English isn’t my first language, so please excuse any mistakes.
- Contact me for proposals or questions.
- This project uses the library [Gson](https://github.com/google/gson) for JSON interactions.

## Getting Started

### Download And Use
1. download last releases from [GitHub](https://github.com/SCHREDDO/ClickUp-Java/releases)
2. add ClickUp-Java to your project
3. add Gson 2.4 or higher to your project

### Building From Source
1. clone ClickUp-Java go in the folder '\ClickUp-Java\ClickUp-Java'
2. build ClickUp-Java 'jar cvf clickup-java.jar -C src\main\java .'
3. add ClickUp-Java to your project
4. add Gson 2.4 or higher to your project

## Usage
### API Calls
A list of available API calls of the ClickUp API. For more information [click here](https://clickup.com/api).

| API Call | Method | Return/.obj() Type |
|----------|--------|--------------------|
| Get Access Token | getAccessToken(String clientId, String clientSecret, String code) | Boolean |
| Get Authorized User | getAuthorizedUser() | CUUser |
| Get Authorized Teams | getAuthorizedTeams() | ArrayList\<CUTeams\> |
| Get Teams | getTeams() | ArrayList\<CUTeams\> |
| Create Space | createSpace(Long teamID, CUSpace space) | CUSpace |
| Update Space | updateSpace(Long spaceID, CUSpace space) | CUSpace |
| Delete Space | deleteSpace(Long spaceID) | Boolean |
| Get Spaces | getSpaces(Long teamID, Boolean archived) | ArrayList\<CUSpace\> |
| Get Space | getSpace(Long spaceID) | CUSpace |
| Create Folder | createFolder(Long spaceID, CUFolder folder) | CUFolder |
| Update Folder | updateFolder(Long folderID, CUFolder folder) | CUFolder |
| Delete Folder | deleteFolder(Long folderID) | Boolean |
| Get Folders | getFolders(Long spaceID, Boolean archived) | ArrayList\<CUFolder\> |
| Get Folder | getFolder(Long folderID) | CUFolder |
| Create List | createList(Long folderID, CUList list) | CUList |
| Create Folderless List | createFolderlessList(Long spaceID, CUList list) | CUList |
| Update List | updateList(String listID, CUList list) | CUList |
| Delete List | deleteList(Long listID) | Boolean |
| Get Lists | getLists(Long folderID, Boolean archived) | ArrayList\<CUList\> |
| Get Folderless Lists | getFolderlessLists(Long spaceID, Boolean archived) | ArrayList\<CUList\> |
| Get List | getList(Long listID) | CUList |
| Create Task | createTask(Long listID, CUTask task) | CUTask |
| Update Task | updateTask(String taskID, CUTask task) | CUTask |
| Delete Task | deleteTask(String taskID) | Boolean |
| Get Tasks | getTasks(Long listID, Boolean archived) | ArrayList\<CUTask\> |
| Get Task | getTask(String taskID) | CUTask |
| Get List Members | getListMembers(Long listID) | ArrayList\<CUMember\> |
| Get Task Members | getTaskMembers(String taskID) | ArrayList\<CUMember\> |

### Examples

## Dependencies
### Runtime Dependencies
- Java 1.5 or higher
- Gson 2.4 or higher 
### Development Dependencies
- Java 1.5
- Gson 2.4

## Changelog

## Support Possibilities
- give proposals
- report bugs

## License
ClickUp-Java is released under the [AGPL-3.0](https://www.gnu.org/licenses/agpl-3.0.de.html) License.
