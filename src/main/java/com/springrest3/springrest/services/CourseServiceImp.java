package com.springrest3.springrest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest3.springrest.dao.CourseDao;
import com.springrest3.springrest.entities.Course;

@Service
public class CourseServiceImp implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	//List<Course> list;
	
	public CourseServiceImp()
	{
		//list= new ArrayList<>();
		//list.add(new Course(145, "java", "this is java course"));
		//list.add(new Course(146, "sql", "this is sql course"));
		
		
	}

	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(Long courseId) {
		
		//Course c=null;
		//for(Course course:list)
		//{
			//if(course.getId()==courseId)
			//{
				//c=course;
				//break;
			//}getOne(courseId)
		//}
		return courseDao.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		//list.forEach(e -> {
			//if(e.getId()==course.getId())
			//{
			//	e.setTitle(course.getTitle());
			//	e.setDescription(course.getDescription());
			//}
		//});
		
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(Long courseId) {
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
         Course course = getCourse(courseId);
         if(course == null) {
        	System.out.println("NOT DELETED"); 
         }
         courseDao.deleteById(courseId);
	}


}
