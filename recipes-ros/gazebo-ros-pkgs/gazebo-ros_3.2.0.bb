DESCRIPTION = "Provides ROS plugins that offer message and service publishers for interfacing with <a href="http://gazebosim.org">Gazebo</a> through ROS.Formally simulator_gazebo/gazebo"
SECTION = "devel"
LICENSE = "Apache 2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "gazebo-dev gazebo-msgs roslib roscpp tf std-srvs rosgraph-msgs dynamic-reconfigure std-msgs geometry-msgs tinyxml"

require gazebo-ros-pkgs.inc
