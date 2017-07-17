# Opendaylight-Template-Updated
Modifying the template as an exercise for the Technical Challenge for 5G UK workshop.

## Update 1
* Added additional files and code to make the project executable. The project cloned from the original repository 'Opendaylight-Template' was not building without the 'reference' and 'negotiator' modules.(Cloned the original repo on 14th july 11:50 PM)
* Added the TCP match for source and destination port as specified in the task 2 of the techincal challenge.
* Verified the execution of the task with the help of mininet, DLUX and opendaylight CLI.

## Update 2
* Added the functionality required to accomplish task 1 of the technical challenge. In other words, added the Instruction with Meter ID set to 1 in the flow in SwitchConfigurator.java
* Tested this functionality by building and running the project and simulating using using mininet and seeing the logs on opendaylight CLI. 

## Update 3
* Added the functionality required to accomplish task 4 of the technical challenge, i.e, Implemented the function getAllLinks() in NodeMonitor.java to get the information of all the links in the topology.
* Called this function in measureNodeStatistics() so that it can be called with the help of 'reference' and 'negotiator' modules API calls in YANG UI with a mininet virtual network running in the background. Then checked the Links in the log in opendaylight CLI with this command - ```opendaylight-user@root>log:display | grep Link```

## Update 4
* Set the queue ID to 3 as asked in the task 3 of the technical challenge.
* Verified the task with the help of mininet, DLUX and opendaylight CLI (Logging).
