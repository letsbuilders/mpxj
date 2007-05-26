//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.3-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.02.21 at 11:46:13 GMT 
//


package net.sf.mpxj.planner.schema;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.sf.mpxj.planner.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends net.sf.mpxj.planner.schema.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(37, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static net.sf.mpxj.planner.schema.impl.runtime.GrammarInfo grammarInfo = new net.sf.mpxj.planner.schema.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (net.sf.mpxj.planner.schema.ObjectFactory.class));
    public final static java.lang.Class version = (net.sf.mpxj.planner.schema.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((net.sf.mpxj.planner.schema.Resource.class), "net.sf.mpxj.planner.schema.impl.ResourceImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.ResourceGroups.class), "net.sf.mpxj.planner.schema.impl.ResourceGroupsImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.DefaultWeek.class), "net.sf.mpxj.planner.schema.impl.DefaultWeekImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.OverriddenDayType.class), "net.sf.mpxj.planner.schema.impl.OverriddenDayTypeImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Project.class), "net.sf.mpxj.planner.schema.impl.ProjectImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Predecessors.class), "net.sf.mpxj.planner.schema.impl.PredecessorsImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.OverriddenDayTypes.class), "net.sf.mpxj.planner.schema.impl.OverriddenDayTypesImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Allocations.class), "net.sf.mpxj.planner.schema.impl.AllocationsImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Task.class), "net.sf.mpxj.planner.schema.impl.TaskImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Predecessor.class), "net.sf.mpxj.planner.schema.impl.PredecessorImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Calendar.class), "net.sf.mpxj.planner.schema.impl.CalendarImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Calendars.class), "net.sf.mpxj.planner.schema.impl.CalendarsImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Group.class), "net.sf.mpxj.planner.schema.impl.GroupImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.DayType.class), "net.sf.mpxj.planner.schema.impl.DayTypeImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Days.class), "net.sf.mpxj.planner.schema.impl.DaysImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.ListItem.class), "net.sf.mpxj.planner.schema.impl.ListItemImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Property.class), "net.sf.mpxj.planner.schema.impl.PropertyImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Resources.class), "net.sf.mpxj.planner.schema.impl.ResourcesImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Tasks.class), "net.sf.mpxj.planner.schema.impl.TasksImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Interval.class), "net.sf.mpxj.planner.schema.impl.IntervalImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Constraint.class), "net.sf.mpxj.planner.schema.impl.ConstraintImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Allocation.class), "net.sf.mpxj.planner.schema.impl.AllocationImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Day.class), "net.sf.mpxj.planner.schema.impl.DayImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.DayTypes.class), "net.sf.mpxj.planner.schema.impl.DayTypesImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Properties.class), "net.sf.mpxj.planner.schema.impl.PropertiesImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Phase.class), "net.sf.mpxj.planner.schema.impl.PhaseImpl");
        defaultImplementations.put((net.sf.mpxj.planner.schema.Phases.class), "net.sf.mpxj.planner.schema.impl.PhasesImpl");
        rootTagMap.put(new javax.xml.namespace.QName("", "days"), (net.sf.mpxj.planner.schema.Days.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "resource-groups"), (net.sf.mpxj.planner.schema.ResourceGroups.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "overridden-day-type"), (net.sf.mpxj.planner.schema.OverriddenDayType.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "day-types"), (net.sf.mpxj.planner.schema.DayTypes.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "constraint"), (net.sf.mpxj.planner.schema.Constraint.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "resources"), (net.sf.mpxj.planner.schema.Resources.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "overridden-day-types"), (net.sf.mpxj.planner.schema.OverriddenDayTypes.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "properties"), (net.sf.mpxj.planner.schema.Properties.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "tasks"), (net.sf.mpxj.planner.schema.Tasks.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "allocation"), (net.sf.mpxj.planner.schema.Allocation.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "calendar"), (net.sf.mpxj.planner.schema.Calendar.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "calendars"), (net.sf.mpxj.planner.schema.Calendars.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "phase"), (net.sf.mpxj.planner.schema.Phase.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "phases"), (net.sf.mpxj.planner.schema.Phases.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "list-item"), (net.sf.mpxj.planner.schema.ListItem.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "predecessor"), (net.sf.mpxj.planner.schema.Predecessor.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "group"), (net.sf.mpxj.planner.schema.Group.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "day"), (net.sf.mpxj.planner.schema.Day.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "predecessors"), (net.sf.mpxj.planner.schema.Predecessors.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "allocations"), (net.sf.mpxj.planner.schema.Allocations.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "property"), (net.sf.mpxj.planner.schema.Property.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "resource"), (net.sf.mpxj.planner.schema.Resource.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "interval"), (net.sf.mpxj.planner.schema.Interval.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "day-type"), (net.sf.mpxj.planner.schema.DayType.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "project"), (net.sf.mpxj.planner.schema.Project.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "default-week"), (net.sf.mpxj.planner.schema.DefaultWeek.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "task"), (net.sf.mpxj.planner.schema.Task.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.sf.mpxj.planner.schema
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param value
     *     the value of the property to be set
     * @param name
     *     the name of the property to retrieve
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of Resource
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Resource createResource()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.ResourceImpl();
    }

    /**
     * Create an instance of ResourceGroups
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.ResourceGroups createResourceGroups()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.ResourceGroupsImpl();
    }

    /**
     * Create an instance of DefaultWeek
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.DefaultWeek createDefaultWeek()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.DefaultWeekImpl();
    }

    /**
     * Create an instance of OverriddenDayType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.OverriddenDayType createOverriddenDayType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.OverriddenDayTypeImpl();
    }

    /**
     * Create an instance of Project
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Project createProject()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.ProjectImpl();
    }

    /**
     * Create an instance of Predecessors
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Predecessors createPredecessors()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.PredecessorsImpl();
    }

    /**
     * Create an instance of OverriddenDayTypes
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.OverriddenDayTypes createOverriddenDayTypes()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.OverriddenDayTypesImpl();
    }

    /**
     * Create an instance of Allocations
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Allocations createAllocations()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.AllocationsImpl();
    }

    /**
     * Create an instance of Task
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Task createTask()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.TaskImpl();
    }

    /**
     * Create an instance of Predecessor
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Predecessor createPredecessor()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.PredecessorImpl();
    }

    /**
     * Create an instance of Calendar
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Calendar createCalendar()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.CalendarImpl();
    }

    /**
     * Create an instance of Calendars
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Calendars createCalendars()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.CalendarsImpl();
    }

    /**
     * Create an instance of Group
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Group createGroup()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.GroupImpl();
    }

    /**
     * Create an instance of DayType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.DayType createDayType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.DayTypeImpl();
    }

    /**
     * Create an instance of Days
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Days createDays()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.DaysImpl();
    }

    /**
     * Create an instance of ListItem
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.ListItem createListItem()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.ListItemImpl();
    }

    /**
     * Create an instance of Property
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Property createProperty()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.PropertyImpl();
    }

    /**
     * Create an instance of Resources
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Resources createResources()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.ResourcesImpl();
    }

    /**
     * Create an instance of Tasks
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Tasks createTasks()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.TasksImpl();
    }

    /**
     * Create an instance of Interval
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Interval createInterval()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.IntervalImpl();
    }

    /**
     * Create an instance of Constraint
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Constraint createConstraint()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.ConstraintImpl();
    }

    /**
     * Create an instance of Allocation
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Allocation createAllocation()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.AllocationImpl();
    }

    /**
     * Create an instance of Day
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Day createDay()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.DayImpl();
    }

    /**
     * Create an instance of DayTypes
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.DayTypes createDayTypes()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.DayTypesImpl();
    }

    /**
     * Create an instance of Properties
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Properties createProperties()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.PropertiesImpl();
    }

    /**
     * Create an instance of Phase
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Phase createPhase()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.PhaseImpl();
    }

    /**
     * Create an instance of Phases
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sf.mpxj.planner.schema.Phases createPhases()
        throws javax.xml.bind.JAXBException
    {
        return new net.sf.mpxj.planner.schema.impl.PhasesImpl();
    }

}